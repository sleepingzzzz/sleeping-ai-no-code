<script setup lang="ts">
import { Card, Row, Col, Button, Typography } from 'ant-design-vue'

const { Title, Paragraph } = Typography
</script>


<style scoped>
.home-page {
  padding: 40px 0;
}

.hero-section {
  text-align: center;
  margin-bottom: 60px;
}

.hero-title {
  color: #1890ff;
  margin-bottom: 20px;
}

.hero-description {
  font-size: 18px;
  color: #666;
  margin-bottom: 30px;
  max-width: 600px;
  margin-left: auto;
  margin-right: auto;
}

.hero-button {
  height: 50px;
  padding: 0 40px;
  font-size: 16px;
}

.features-section {
  margin-top: 40px;
}

.feature-card {
  height: 200px;
  text-align: center;
}

.feature-card :deep(.ant-card-body) {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .hero-section {
    margin-bottom: 40px;
  }

  .hero-title {
    font-size: 24px;
  }

  .hero-description {
    font-size: 16px;
  }

  .features-section {
    margin-top: 20px;
  }
}
</style>
