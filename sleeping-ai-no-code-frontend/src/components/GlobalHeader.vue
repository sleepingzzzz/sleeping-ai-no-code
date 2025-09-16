<template>
  <a-layout-header class="global-header">
    <div class="header-content">
      <!-- Logo 和标题 -->
      <div class="logo-section">
        <img src="@/assets/logo.png" alt="Logo" class="logo" />
        <span class="site-title">AI零代码交互式应用开发工具</span>
      </div>

      <!-- 菜单项 -->
      <a-menu
        v-model:selectedKeys="selectedKeys"
        mode="horizontal"
        theme="dark"
        class="header-menu"
        @click="handleMenuClick"
      >
        <a-menu-item key="home">
          <template #icon>
            <HomeOutlined />
          </template>
          首页
        </a-menu-item>
        <a-menu-item key="projects">
          <template #icon>
            <AppstoreOutlined />
          </template>
          项目管理
        </a-menu-item>
        <a-menu-item key="templates">
          <template #icon>
            <FileTextOutlined />
          </template>
          模板库
        </a-menu-item>
        <a-menu-item key="docs">
          <template #icon>
            <BookOutlined />
          </template>
          文档
        </a-menu-item>
      </a-menu>

      <!-- 用户区域 -->
      <div class="user-section">
        <a-button type="primary" @click="handleLogin">
          <template #icon>
            <UserOutlined />
          </template>
          登录
        </a-button>
      </div>
    </div>
  </a-layout-header>
</template>

<script lang="ts" setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import {
  HomeOutlined,
  AppstoreOutlined,
  FileTextOutlined,
  BookOutlined,
  UserOutlined
} from '@ant-design/icons-vue'

const router = useRouter()
const selectedKeys = ref<string[]>(['home'])

// 菜单配置
const menuConfig = {
  home: '/',
  projects: '/projects',
  templates: '/templates',
  docs: '/docs'
}

const handleMenuClick = ({ key }: { key: string }) => {
  const path = menuConfig[key as keyof typeof menuConfig]
  if (path) {
    router.push(path)
  }
}

const handleLogin = () => {
  // TODO: 实现登录逻辑
  console.log('登录按钮被点击')
}
</script>

<style scoped>
.global-header {
  padding: 12px 0 !important;
  background: #001529;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  height: auto;
  min-height: 64px;
}

.header-content {
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 100%;
  width: 100%;
  padding: 0 24px;
  min-height: 40px;
}

.logo-section {
  display: flex;
  align-items: center;
  gap: 12px;
}

.logo {
  height: 48px;
  width: auto;
}

.site-title {
  color: white;
  font-size: 24px;
  font-weight: 600;
}

.header-menu {
  flex: 1;
  justify-content: center;
  background: transparent;
  border-bottom: none;
  font-size: 20px;
}

.header-menu .ant-menu-item {
  font-size: 20px;
}

.header-menu .anticon {
  font-size: 20px;
}

.user-section {
  display: flex;
  align-items: center;
}

.user-section .ant-btn {
  font-size: 20px;
  height: 48px;
  padding: 0 28px;
}

.user-section .anticon {
  font-size: 20px;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .header-content {
    padding: 0 16px;
  }

  .site-title {
    display: none;
  }

  .header-menu {
    display: none;
  }
}

@media (max-width: 576px) {
  .logo {
    height: 36px;
  }
}
</style>
