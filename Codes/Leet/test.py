import numpy as np
import matplotlib.pyplot as plt

def heart_shape():
    t = np.linspace(0, 2 * np.pi, 100)
    x = 16 * np.sin(t)**3
    y = 13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)
    return x, y

def plot_heart():
    x, y = heart_shape()
    plt.figure(figsize=(6, 6))
    plt.plot(x, y, 'r')
    plt.fill(x, y, 'r', alpha=0.5)
    plt.axis("equal")
    plt.axis("off")
    plt.title("我爱林鋆函", fontsize=14, fontweight='bold')
    plt.show(block=True)

if __name__ == "__main__":
    plt.ion()
    plot_heart()
