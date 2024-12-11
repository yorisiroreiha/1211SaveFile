import tkinter as tk
import tkinter.messagebox as mbox

def bt_click():
    mbox.showinfo("info","button is pushed")

root = tk.Tk()
root.title("my window")
root.geometry("400x200")
btn= tk.Button(text="test",command=bt_click)
btn.pack()
root.mainloop()
