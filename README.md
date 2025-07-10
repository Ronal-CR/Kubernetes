
````md
# 🧭 Pasos para desplegar una aplicación Spring Boot en Kubernetes

Este instructivo detalla los pasos para desplegar correctamente una aplicación Java Spring Boot en Kubernetes, utilizando un `Deployment`, un `Service` y un `Namespace` personalizado.

---

## 📌 1. Crear un `Namespace`

Desde la raíz del proyecto (por ejemplo, en una carpeta llamada `kubernetes` o `manifest`):

```bash
kubectl apply -f namespace.yml
````

Establecer el namespace como predeterminado:

```bash
kubectl config set-context --current --namespace=ronaldinho-namespace
```

---

## 📌 2. Aplicar el Service

Este paso crea un recurso `Service` para exponer tu aplicación dentro del clúster.

```bash
kubectl apply -f service.yml
```

---

## 📌 3. Aplicar el Deployment

Esto crea el `Deployment`, que se encargará de mantener el contenedor activo.

```bash
kubectl apply -f deployment.yml
```

---

## 📌 4. Verificar recursos desplegados

Asegúrate de que el Pod esté en estado `Running`:

```bash
kubectl get all
```

---

## 📌 5. Exponer el puerto localmente

Usa `port-forward` para acceder a la app desde tu máquina local:

```bash
kubectl port-forward service/ronaldinho-service 8090:8090
```

> 🔁 Asegúrate de que el `port` y `targetPort` del Service sean `8090`.

---

## 📌 6. Probar la API

Una vez que el reenvío de puerto esté activo, puedes probar tu aplicación:

```bash
curl http://localhost:8090/api/datos
```

También puedes abrirlo en tu navegador:

```
http://localhost:8090/api/datos
```

---

## ✅ Resultado esperado

La aplicación debería responder con los datos esperados desde tu endpoint `/api/datos`.

---

¿Deseas que lo convierta en un archivo descargable `.md` o subirlo a un README para tu repo?
