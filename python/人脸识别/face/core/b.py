import cv2 as cv
import numpy as np
from PIL import Image
import os


def main():
    path = "F:/work/resource/face/face"
    recognizer = cv.face.LBPHFaceRecognizer_create()
    detector = cv.CascadeClassifier("F:/work/resource/face/haarcascades/haarcascade_frontalface_default.xml")
    imagePaths = [os.path.join(path,f) for f in os.listdir(path)]
    faceSamples = []
    ids = []
    for imagePath in imagePaths:
        PIL_img = Image.open(imagePath).convert('L')
        img_numpy = np.array(PIL_img,'uint8')
        id = int(os.path.split(imagePath)[-1].split(".")[1])
        faces = detector.detectMultiScale(img_numpy)
        for (x,y,w,h) in faces:
            faceSamples.append(img_numpy[y:y+h,x:x+w])
            ids.append(id)
    recognizer.train(faceSamples, np.array(ids))
    recognizer.write("F:/work/resource/face/trainer.yml")
main()
