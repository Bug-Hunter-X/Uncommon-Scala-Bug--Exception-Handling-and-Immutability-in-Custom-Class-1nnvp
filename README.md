# Uncommon Scala Bug: Exception Handling and Immutability

This repository demonstrates an uncommon bug in Scala related to exception handling within a custom class that attempts to manage immutability. The `MyClass` class has a `value` property designed to be set only with positive integers. However, improper handling of exceptions or misuse of the class could lead to unexpected results.  The bug is subtle and might not be immediately apparent to developers less familiar with Scala's features and exception handling practices.