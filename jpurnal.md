# Phase 1

I created InventoryComponent and Item to store and display item names and weights. Default methods throw UnsupportedOperationException so subclasses only implement supported operations, allowing items and bags to be treated uniformly.

# Phase 2

I created Bag to store items and calculate their combined weight. Polymorphism and recursion let bags calculate weight without knowing whether their contents are items or other bags.

# Phase 3

I built a nested inventory with items and bags inside other bags. Recursive methods calculate total weight and display contents. Adding a new container type can extend the system without modifying existing classes.