class Doll:
    total_price = 0
    #this price is the same in all object in this class
    def __init__(self, name, material, dimension, price):
        self.name = name
        self.material = material
        self.dimension = dimension
        self.price = price
        Doll.total_price += price

    def __str__(self):
        return self.name
    
    def __lt__(self, other):
        volume = lambda l,w,h : l*w*h
        return volume(*self.dimension) < volume(other.dimension)
    
    def play(self):
        pass

    def display_info(self):
        print("{} {} {} {}".format(self.name, self.material, self.dimension, self.price))

    def is_fragile(self):
        if self.material == "Porcelain" or self.material == "Glass":
            return True
        return False

class Barbie(Doll):
    def __init__(self, name, material, dimension, price):
        super().__init__(name, material, dimension, price)

    def play(self):
        print("Barbie sings: I'm a Barbie girl in a Barbie world!")

class TeddyDoll(Doll):
    def __init__(self, name, material, dimension, price):
        super().__init__(name, material, dimension, price)
    
    def play(self):
        print("Teddy Doll says: Hug me!")

class PorcelainDoll(Doll):
    def __init__(self, name, material, dimension, price):
        super().__init__(name, material, dimension, price)

    def play(self):
        print("Porcelain Doll is delicate, be gentle!")

dolls = [
    Barbie("Barbie1", "Plastic", (30, 20, 10), 29.99),
    Barbie("Barbie2", "Plastic", (30, 20, 10), 34.99),
    TeddyDoll("Teddy", "Plush", (25, 15, 12), 19.99),
    PorcelainDoll("Porcelain1", "Porcelain", (18, 10, 8), 49.99),
    PorcelainDoll("Porcelain2", "Porcelain", (18, 10, 8), 59.99)
]
getName = lambda doll : doll.name 
print(*map(getName,dolls))
print()
allPrice = 0
for doll in dolls:
    allPrice += doll.price
print("Total price of all dolls: {}".format(allPrice))
# print(Doll.total_price)
print()
print("Dolls sorted by price:")
price = [(x.price, x.name) for x in dolls]
for p, n in sorted(price):
    print("{}: ${}".format(n,p))
print()
print("Playing with all dolls:")
for doll in dolls:
    doll.play()
print()
print("Playing with non-fragile dolls:")
nonFragile = [x for x in dolls if x.is_fragile() == False ]
for x in nonFragile:
    x.play()



