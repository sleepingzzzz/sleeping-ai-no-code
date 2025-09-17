declare namespace API {
  type BaseResponseLong = {
    code?: number
    data?: number
    message?: string
  }

  type BaseResponseString = {
    code?: number
    data?: string
    message?: string
  }

  type getInfoParams = {
    id: number
  }

  type pageParams = {
    page: PageUser
  }

  type PageUser = {
    records?: User[]
    pageNumber?: number
    pageSize?: number
    totalPage?: number
    totalRow?: number
    optimizeCountQuery?: boolean
  }

  type removeParams = {
    id: number
  }

  type User = {
    id?: number
    userAccount?: string
    userPassword?: string
    userName?: string
    userAvatar?: string
    userProfile?: string
    userRole?: string
    editTime?: string
    createTime?: string
    updateTime?: string
    isDelete?: number
  }

  type UserRegisterRequest = {
    userAccount?: string
    userPassword?: string
    checkPassword?: string
  }
}
