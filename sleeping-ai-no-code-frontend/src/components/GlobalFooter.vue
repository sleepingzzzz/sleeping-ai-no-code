<template>
  <a-layout-footer class="global-footer">
    <div class="footer-content">
      <p class="copyright">
        AI零代码交互式应用开发工具 by sleeping
      </p>
    </div>
  </a-layout-footer>
</template>

<script lang="ts" setup>
// 底部组件，无需额外逻辑
</script>

<style scoped>
.global-footer {
  background: #f0f2f5;
  border-top: 1px solid #d9d9d9;
  padding: 16px 0;
  text-align: center;
  position: relative;
  bottom: 0;
  width: 100%;
}

.footer-content {
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 24px;
}

.copyright {
  margin: 0;
  color: #666;
  font-size: 14px;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .footer-content {
    padding: 0 16px;
  }
  
  .copyright {
    font-size: 12px;
  }
}
</style>
