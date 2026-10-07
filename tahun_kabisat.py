"""
Menentukan tahun kabisat
"""


def tahun_kabisat(x: int):
    """
    Fungsi
    """
    if x % 4 == 0 and x % 100 == 0 and x % 400 == 0:
        return "Tahun Kabisat"
    elif x % 4 == 0 and x % 100 == 0 and x % 400 != 0:
        return "Bukan Tahun Kabisat"
    elif x % 4 == 0:
        return "Tahun Kabisat"
    else:
        return "Bukan Tahun Kabisat"


HASIL = tahun_kabisat(1900)
print(HASIL)
