import tkinter as tk

root = tk.Tk()
root.geometry("240x240")
root.title("GUI sample")
button = tk.Button(root,text="Hello,World")
button.pack()
root.mainloop()
