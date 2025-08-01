# Flujo de Arquitectura: Controller → Service → DAO → Model (DTO)

## Diagrama del Flujo

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Controller    │    │     Service     │    │      DAO        │    │     Model       │
│   (UserAction)  │    │   (UserService) │    │  (UserDAOImpl)  │    │     (User)      │
└─────────────────┘    └─────────────────┘    └─────────────────┘    └─────────────────┘
         │                       │                       │                       │
         │                       │                       │                       │
         ▼                       ▼                       ▼                       ▼
   ┌─────────────┐       ┌─────────────┐       ┌─────────────┐       ┌─────────────┐
   │   UserDTO   │       │   UserDTO   │       │    User     │       │    User     │
   │   (View)    │       │ (Business)  │       │  (Internal) │       │  (Entity)   │
   └─────────────┘       └─────────────┘       └─────────────┘       └─────────────┘
```

## Flujo Detallado

### 1. **Controller Layer** (`UserAction`)

- **Responsabilidad**: Manejar requests HTTP y respuestas
- **Usa**: `UserDTO` para comunicación con la vista
- **Métodos principales**:
  - `list()` - Obtiene lista de usuarios
  - `view()` - Muestra un usuario específico
  - `create()` - Crea nuevo usuario
  - `update()` - Actualiza usuario existente
  - `delete()` - Elimina usuario

### 2. **Service Layer** (`UserService`)

- **Responsabilidad**: Lógica de negocio y transformación de datos
- **Usa**: `UserDTO` para comunicación externa, `User` para operaciones internas
- **Depende de**: `UserDAO` para acceso a datos
- **Métodos DTO** (para Controller):
  - `getAllUserDTOs()`
  - `getUserDTOByUsername()`
  - `addUserDTO()`
  - `updateUserDTO()`
  - `deleteUserDTO()`
- **Métodos Model** (usan DAO):
  - `getAllUsers()` → `userDAO.findAll()`
  - `getUserByUsername()` → `userDAO.findByUsername()`
  - `addUser()` → `userDAO.save()`
  - `updateUser()` → `userDAO.update()`
  - `deleteUser()` → `userDAO.delete()`

### 3. **DAO Layer** (`UserDAOImpl`)

- **Responsabilidad**: Acceso a datos (base de datos, archivos, memoria)
- **Usa**: `User` model para operaciones de datos
- **Métodos**:
  - `findAll()` - Obtiene todos los usuarios
  - `findByUsername()` - Busca usuario por username
  - `save()` - Guarda nuevo usuario
  - `update()` - Actualiza usuario existente
  - `delete()` - Elimina usuario

### 4. **Model Layer** (`User`)

- **Responsabilidad**: Entidad de dominio
- **Contiene**: Lógica de negocio básica y validaciones

### 5. **DTO Layer** (`UserDTO`)

- **Responsabilidad**: Transferencia de datos entre capas
- **Usa**: Para comunicación segura entre Controller y Service

### 6. **Mapper** (`UserMapper`)

- **Responsabilidad**: Conversión entre Model y DTO
- **Métodos**:
  - `toDTO()` - Convierte User a UserDTO
  - `toModel()` - Convierte UserDTO a User
  - `toDTOList()` - Convierte lista de User a UserDTO
  - `toModelList()` - Convierte lista de UserDTO a User

# Reload Projects

mvn clean install
f1->java: Reload Projects
