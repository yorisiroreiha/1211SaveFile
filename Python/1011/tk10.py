import tkinter as tk

def btn_click():
    text.insert(tk.END,"モンスターが現れた")

root = tk.Tk()
root.title("my window")
root.geometry("400x200")

btn=tk.Button(text="メッセージ",command=btn_click)
btn.pack()
text=tk.Text()
text.pack()
root.mainloop()
