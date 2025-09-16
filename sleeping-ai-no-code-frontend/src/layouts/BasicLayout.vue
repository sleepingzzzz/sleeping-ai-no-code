<template>
  <a-layout class="basic-layout">
    <!-- 全局头部 -->
    <GlobalHeader />
    
    <!-- 主要内容区域 -->
    <a-layout-content class="main-content">
      <div class="content-wrapper">
        <RouterView />
      </div>
    </a-layout-content>
    
    <!-- 全局底部 -->
    <GlobalFooter />
  </a-layout>
</template>

<script lang="ts" setup>
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalFooter from '@/components/GlobalFooter.vue'
</script>

<style scoped>
.basic-layout {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

.main-content {
  flex: 1;
  background: #fff;
  padding: 0;
  overflow: auto;
}

.content-wrapper {
  min-height: calc(100vh - 64px - 70px); /* 减去头部和底部高度 */
  padding: 24px;
  max-width: 1200px;
  margin: 0 auto;
  width: 100%;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .content-wrapper {
    padding: 16px;
    min-height: calc(100vh - 64px - 60px);
  }
}

@media (max-width: 576px) {
  .content-wrapper {
    padding: 12px;
  }
}
</style>
