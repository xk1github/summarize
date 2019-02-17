import cv2 as cv
import numpy as np


def face_detect_demo(image,count,face_id):
    gray = cv.cvtColor(image,cv.COLOR_BGR2GRAY)
    face_detector = cv.CascadeClassifier("F:/work/resource/face/lbpcascades/lbpcascade_frontalface.xml")
    faces = face_detector.detectMultiScale(gray,1.1,2)
    count = count + 1
    for x,y,w,h in faces:
        cv.rectangle(image,(x,y),(x+w,y+h),(0,0,225),2)
        if count <= 30:
            cv.imwrite("F:/work/resource/face/face/user."+str(face_id)+"." + str(count) + ".jpg",gray[y:y+h,x:x+w])
    cv.imshow("result",image)
    return count


#src = cv.imread("F:/work/resource/face/2.jpg")
def main():
    capture = cv.VideoCapture(0)
#cv.namedWindow("inputimage",cv.WINDOW_AUTOSIZE)
    cv.namedWindow("result",cv.WINDOW_AUTOSIZE)
    cv.startWindowThread()
    face_id = 3
    count = 0
    while(True):
        ret,frame = capture.read()
        frame = cv.flip(frame,1)
        count = face_detect_demo(frame,count,face_id)
        if count >= 30:
            capture.release()
            cv.destroyAllWindows()
            return 1
        c = cv.waitKey(10)
        if c == 27:
            break
#cv.imshow("inputimage",src)
    cv.waitKey(0)
    cv.destroyAllWindows()
main()
