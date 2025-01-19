![image](https://github.com/user-attachments/assets/a971c238-66e4-4bf8-9837-2d5ea9feff66)
![image](https://github.com/user-attachments/assets/97ee02ed-c0ac-4515-b0d5-94e17ab95d04)
from PIL import Image

def compress_image(input_path, output_path, quality=75):
    Image.open(input_path).save(output_path, "JPEG", optimize=True, quality=quality)

# Ejemplo
compress_image("imagen_original.jpg", "imagen_comprimida.jpg")
