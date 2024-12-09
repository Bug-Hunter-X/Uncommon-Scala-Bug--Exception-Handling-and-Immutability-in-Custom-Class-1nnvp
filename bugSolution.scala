```scala
class MyClass(val name: String, initialValue: Int = 0) {
  private var _value: Int = initialValue
  require(initialValue >= 0, "Initial value cannot be negative")

  def value: Int = _value

  def value_=(newValue: Int): Unit = {
    require(newValue >= 0, "Value cannot be negative")
    _value = newValue
  }

  def copy(newValue: Int): MyClass = {
    require(newValue >=0, "Value cannot be negative")
    new MyClass(name, newValue)
  }
}
```