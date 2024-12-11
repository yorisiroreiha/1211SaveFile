class Hero:
    def __init__(self,name="nay",hp=100):
        self.name = name
        self.hp = hp
    def sleep(self,hours):
        print(f"{self.name}は{hours}寝た")
        self.hp += hours
