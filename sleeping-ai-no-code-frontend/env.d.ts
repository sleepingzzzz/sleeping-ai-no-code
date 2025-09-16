/// <reference types="vite/client" />

declare module '@/request' {
  import { AxiosInstance } from 'axios'
  const request: AxiosInstance
  export default request
}
