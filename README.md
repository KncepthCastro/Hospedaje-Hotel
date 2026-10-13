<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2D1B3D,100:4A2C5E&height=180&section=header&text=Ejercicio%20%C2%B7%20Hospedaje%20en%20Hotel%20%F0%9F%8F%A8&fontSize=38&fontColor=FAF6EE&animation=fadeIn&fontAlignY=38" />

### 💜 Java + NetBeans 🌸

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=18&duration=3000&pause=1000&color=C8A2E0&center=true&vCenter=true&width=600&lines=C%C3%A1lculo+del+total+a+pagar;Aplicaci%C3%B3n+de+escritorio;Java+%7C+NetBeans;L%C3%B3gica+por+tramos+y+descuentos" alt="Typing SVG" />

</div>

Aplicación de escritorio desarrollada en **Java** con **NetBeans** que calcula el **total a pagar** por la hospedaje de un cliente en un hotel, a partir de la cantidad de noches, el precio por noche y el tipo de cliente.

---

### 🎯 Objetivo

Solicitar al usuario los datos necesarios y aplicar de forma secuencial los cargos y descuentos correspondientes para obtener el monto final a pagar.

**Datos de entrada:**

- 📅 Cantidad de noches de hospedaje
- 💵 Precio por noche
- 👤 Tipo de cliente: **Regular** o **Frecuente**

<br>

---

### ⚙️ Cálculo del total

El cálculo se realiza en **4 pasos secuenciales**:

#### 1️⃣ Costo base

```text
Costo base = Cantidad de noches × Precio por noche
```
#### 2️⃣ Cargo por servicio
``` text
Cargo por servicio = Costo base × 8%   (si Costo base ≤ $200)
Cargo por servicio = Costo base × 6%   (si Costo base > $200)

Subtotal = Costo base + Cargo por servicio
```
#### 3️⃣ Descuento según tipo de cliente
``` text
Descuento = Subtotal × 3%   (si el cliente es Regular)
Descuento = Subtotal × 7%   (si el cliente es Frecuente)
``` 
#### 4️⃣ Total a pagar
``` text
Total a pagar = Subtotal − Descuento
``` 
---

<img width="735" height="457" alt="imagen" src="https://github.com/user-attachments/assets/3e2d4da2-6a8a-4f57-b3a1-961cf8ea4f4f" />
