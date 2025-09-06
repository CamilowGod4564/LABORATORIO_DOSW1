# Respuestas sobre Git y Java Collections

## 1. Diferencia entre `git merge` y `git rebase`

- **git merge**: Combina el historial de dos ramas en un nuevo commit de fusión, manteniendo la historia tal como sucedió.  
  Ejemplo:  

- **git rebase**: Reescribe la historia, aplicando los commits de una rama encima de otra, como si siempre hubieran estado ahí.  

## 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer `merge`?
Se genera un **conflicto**. Git no sabe qué cambio conservar y te pide resolverlo manualmente editando el archivo y eligiendo el contenido correcto antes de continuar.


## 3. Ver gráficamente el historial de merges y ramas en consola
Se pueden usar varias cosas:
``bash o git log --oneline --graph --decorate --all

## 4 Diferencia entre un commit y un push 
 commit: Guarda los cambios en tu repositorio local con un mensaje descriptivo.

 push: Envía esos commits al repositorio remoto 

## 5. Para que sirve `git stash` y `git pop`
git stash: Guarda temporalmente los cambios no confirmados para dejar el área de trabajo limpia, sin hacer un commit.

git stash pop: Recupera los cambios guardados con stash y los aplica nuevamente en el área de trabajo.

## 6. Diferencia entre **HashMap** y **Hashtable**
- **HashMap**: 
  - No es sincronizado → no es seguro para entornos con múltiples hilos (threads) a menos que se use una envoltura de sincronización.  
  - Permite una clave `null` y múltiples valores `null`.  
  - Generalmente más rápido al no tener sobrecarga de sincronización.  

- **Hashtable**: 
  - Es sincronizado → seguro para entornos multihilo pero menos eficiente en entornos de un solo hilo.  
  - No permite claves `null` ni valores `null`.  
  - Considerado más "antiguo", en la práctica se recomienda `ConcurrentHashMap` en lugar de usar `Hashtable`.  

---

## 7. Ventajas de `Collectors.toMap()` frente a un bucle tradicional
- Código más **conciso** y expresivo usando Streams.  
- Permite **transformar y recolectar** en una sola operación.  
- Más fácil de **paralelizar** y mantener.  
- Ejemplo:
  ```java
  Map<String, Integer> mapa = lista.stream()
      .collect(Collectors.toMap(Par::getClave, Par::getValor));
  ```
  En un bucle tradicional, tendrías que crear el mapa y recorrer manualmente.  

---

## 8. Si usas `List` con objetos y luego aplicas `stream().map()`, ¿qué operación haces?
- `map()` es una operación **intermedia** que transforma cada elemento del stream en otro.  
- Se utiliza para aplicar una **función de transformación**.  
- Ejemplo:
  ```java
  List<String> nombres = List.of("Ana", "Luis");
  List<Integer> longitudes = nombres.stream()
      .map(String::length)
      .toList(); // Resultado: [3, 4]
  ```

---

## 9. ¿Qué hace el método `stream().filter()` y qué retorna?
- `filter()` es una operación **intermedia** que recibe un **predicado** (una condición booleana).  
- Retorna un **Stream con los elementos que cumplen la condición**.  
- Ejemplo:
  ```java
  List<Integer> numeros = List.of(1, 2, 3, 4, 5);
  List<Integer> pares = numeros.stream()
      .filter(n -> n % 2 == 0)
      .toList(); // Resultado: [2, 4]
  ```

---

## 10. Paso a paso de cómo crear una rama desde `develop` si es una funcionalidad nueva
1. Cambiarte a la rama `develop`:
   ```bash
   git checkout develop
   ```
2. Actualizarla con los últimos cambios del remoto:
   ```bash
   git pull origin develop
   ```
3. Crear una nueva rama para tu funcionalidad:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
4. Trabajar en tu rama y hacer commits.  
5. Subir tu rama al remoto:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```

---

## 11. Diferencia entre crear una rama con `git branch` y con `git checkout -b`
- `git branch nombre_rama`: solo **crea la rama**, pero no te cambia a ella.  
- `git checkout -b nombre_rama`: crea la rama **y te cambia** automáticamente a esa rama.  

---

## 12. ¿Por qué es recomendable crear ramas `feature/` para nuevas funcionalidades en lugar de trabajar en `main` directamente?
- Mantiene el `main` estable y sin código incompleto o experimental.  
- Facilita la **colaboración** (cada desarrollador trabaja en su feature).  
- Permite usar **pull requests** o **merge requests** para revisión de código.  
- Facilita la integración continua (CI/CD) al mantener el flujo limpio.  
- Se ajusta a buenas prácticas como **Git Flow**.  