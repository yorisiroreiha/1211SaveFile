import tkinter as tk

def check():
    if cval.get()==True:
        print("checked")
    else:
        print("not checked")

root = tk.Tk()
root.title("my window")
root.geometry("400x200")
cval=tk.BooleanVar()
cval.set(False)
cbtn=tk.Checkbutton(text="check button",variable=cval,command=check)
cbtn.pack()
root.mainloop()
