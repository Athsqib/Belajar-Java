"""
Menentukan akar-akar dari persamaan kudrat
"""

import math


def akar(a: int, b: int, c: int):
    """
    Fungsi
    """
    d = float
    x_1 = float
    x_2 = float
    if a == 0:
        return "Nilai a tidak boleh nilai nol"
    else:
        d = (b**2) - (4 * a * c)
        persamaan = f"Akar {'' if a == 1 else a}x^2 + {'' if b == 1 else b}x + {c}"
        if d > 0:
            d_akar = math.sqrt(d)
            x_1 = -b + (d_akar / (2 * a))
            x_2 = -b - (d_akar / (2 * a))
            return f"{persamaan}: x1 = {x_1} dan x2 = {x_2}"
        if d == 0:
            x_1 = -b / (2 * a)
            return f"{persamaan}: x1 = x2 = {x_1}"
        else:
            real_part = -b / (2 * a)
            imag_part = math.sqrt(abs(d)) / abs(2 * a)
            x_1 = f"{real_part:.2f} + {imag_part:.2f}i"
            x_2 = f"{real_part:.2f} - {imag_part:.2f}i"
            return f"{persamaan}: x1 = {x_1} dan x2 = {x_2}"


A = int(input("Masukkan a: "))
B = int(input("Masukkan b: "))
C = int(input("Masukkan c: "))
HASIL = akar(A, B, C)
print(HASIL)
