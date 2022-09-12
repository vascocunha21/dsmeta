// ?? -> Significa que vai pegar a variável de ambiente, se não existir pega o localhost
export const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";
