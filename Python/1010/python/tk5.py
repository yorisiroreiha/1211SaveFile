import tkinter as tk
root=tk.Tk()
root.title('My Window')
root.geometry('600x400')
# ボタンを作成 
btn=tk.Button(root,text='Click Me!',font=('Arial',50))
# ボタンを配置 
btn.place(x=100,y=100)
root.mainloop()
