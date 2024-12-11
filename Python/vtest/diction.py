def update_dict(d, key, value):
    temp_dict = d.copy()
    temp_dict[key] = value
    return temp_dict
   # ここを修正

my_dict = {"a": 1, "b": 2}
#戻り値を受け取るように修正
new_dict=update_dict(my_dict, "c", 3)
print(my_dict)
print(new_dict)  # 期待される出力は {"a": 1, "b": 2, "c": 3}
