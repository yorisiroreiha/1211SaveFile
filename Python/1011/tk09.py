import tkinter as tk

def btn_click():
    text=entry.get()
    btn["text"]=text

root = tk.Tk()
root.title("my Window")
root.geometry("400x200")
entry=tk.Entry(width=20)
entry.place(x=10,y=10)
btn=tk.Button(text="文字列の取得",command=btn_click)
btn.place(x=20,y=100)
root.mainloop()
