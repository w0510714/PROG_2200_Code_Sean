# Refactoring to abide by SOLID Principles
#
# Single Responsibility Principle
#
# InventoryManager had all of it's functionality in one file/class
# In order to fix SRP I needed to create multiple files with class
# that only had one purpose. All functionality communicates with
# eachother between classes and still functions the same.
#
# Open/Closed Principle
#
# With all code being in one file every line is tightly connected
# by creating and seperating all files it becomes a lot easier to 
# extend upon the exisiting code. I used interfaces for InventorySaver
# and InventoryViewer as I can implement the corresponding other 
# class with them. With that it will allow for future 
# extensions and code being less reliant on one another.
#
# Liskov Substitution Principle
#
# LSP directly wasn't involved here until I added interfaces.
# After I involved interfaces I made sure the behavior of the code
# wasn't getting changed by future code but allowing for replacement
# of future derived classes.
#
# Interface Segregation Principle
#
# Interfaces are split accordingly;
# one for InventorySaver and another for InventoryViewer
#
# Dependency Inversion Principle
#
# All my functions rely on interfaces not hard-coded code.
# My InventoryManager class never has specific hard-coded code
# it only references code from other classes. Also I added a class
# for my exception as that is concidered a hard-coded line.
#
#
# Note: I had previous commits but it broke, so I just have this final commit. Hope thats fine.