human_Hobby = {"松田":{"SNS","麻雀","算数"},"浅木":{"SNS","算数","食べ歩き"},}

wa_Hobby = human_Hobby["松田"] | human_Hobby["浅木"]
print(wa_Hobby)
seki_Hobby = human_Hobby["松田"] & human_Hobby["浅木"]
print(seki_Hobby)
sa_Hobby = human_Hobby["松田"] - human_Hobby["浅木"]
print(sa_Hobby)
sa2_Hobby = human_Hobby["浅木"] - human_Hobby["松田"]
print(sa2_Hobby)
taishou_Hobby = human_Hobby["松田"] ^ human_Hobby["浅木"]
print(taishou_Hobby)
