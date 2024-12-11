def inputData():
    network = int(input("ネットワークの得点?>>")
    security = int(input("セキュリティの得点?>>")
    database = int(input("データベースの得点?>>")
    scores = [network,security,database]
    return scores 

def calc_average(scores):
    avg = sum(scores)/len(scores)
    return avg 

def output_result(name,avg):
    print(f"{name}さんの平均は{avg}です")
