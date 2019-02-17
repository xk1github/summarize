from tkinter import *
from tkinter import messagebox
from tkinter import simpledialog
from tkinter import filedialog
import a
import b
import c


def nextb(root):
    root.destroy
def nexta(str,root):
    if str == "":
        messagebox.askokcancel('提示框','不能输入空字符串')
    if str != "":
        print(str)
        root.destroy()
        a_isTrue = a.main()
        if a_isTrue == 1:
            print()
            b.main()
            c.main()


root = Tk()
root.geometry("300x200+500+500")

text = Label(root,text="亲输入姓名")
text.place(x=20,y=50)

entry = Entry(root)
entry.place(x=100,y=50)

btn = Button(root,text="确定",command=lambda :nexta(entry.get(),root))
btn.place(x = 150,y = 100)
mainloop()

