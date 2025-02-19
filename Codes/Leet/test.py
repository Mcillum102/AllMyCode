import numpy as np
import matplotlib.pyplot as plt
import time

def heart_shape(scale=1.0):
    t = np.linspace(0, 2 * np.pi, 100)
    x = 16 * np.sin(t)**3 * scale
    y = (13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)) * scale
    return x, y

def plot_heart():
    plt.ion()
    fig, ax = plt.subplots(figsize=(6, 6))
    ax.set_aspect("equal")
    ax.axis("off")
    ax.set_title("我爱林鋆函", fontsize=14, fontweight='bold')
    line, = ax.plot([], [], 'r')
    fill = ax.fill([], [], 'r', alpha=0.5)[0]
    
    for scale in np.linspace(0.9, 1.1, 10).tolist() + np.linspace(1.1, 0.9, 10).tolist():
        x, y = heart_shape(scale)
        line.set_data(x, y)
        fill.set_xy(np.column_stack((x, y)))
        plt.pause(0.1)
    
    plt.ioff()
    plt.show()

if __name__ == "__main__":
    plot_heart()
