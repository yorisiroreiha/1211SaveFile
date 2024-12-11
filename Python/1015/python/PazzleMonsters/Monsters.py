class Monster:
    def __init__(self,name,maxHp,hp,attribute,attack,deffence):
        self.name = name
        self.maxHp = maxHp
        self.hp = hp
        self.attribute = attribute
        self.attack = attack
        self.deffence = deffence

attribute = ["水","火","風","土"]
slime = Monster("",100,100,attribute[0],10,1)
