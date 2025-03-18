import cv2
import numpy as np
from matplotlib import pyplot as plt

# 读取图片
img = cv2.imread('1.jpg')

# 转换为灰度图
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# 边缘检测
_, cartoon = cv2.threshold(gray, 100, 255, cv2.THRESH_BINARY)

# 应用双边滤波器以平滑图像并保留边缘
cartoon = cv2.bilateralFilter(cartoon, 9, 300, 300)

# 显示结果
plt.imshow(cv2.cvtColor(cartoon, cv2.COLOR_BGR2RGB))
plt.title("Cartoonized Image")
plt.show()