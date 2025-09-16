<script setup lang="ts">
import { Card, Row, Col, Button, Typography } from 'ant-design-vue'

const { Title, Paragraph } = Typography
</script>

<template>
  <div class="home-page">
    <div class="hero-section">
      <Title :level="1" class="hero-title"> 欢迎使用 AI零代码交互式应用开发工具 </Title>
      <Paragraph class="hero-description">
        通过可视化拖拽，快速构建您的应用程序，无需编写代码
      </Paragraph>
      <Button type="primary" size="large" class="hero-button"> 开始创建项目 </Button>
    </div>

    <Row :gutter="24" class="features-section">
      <Col :xs="24" :sm="12" :md="8">
        <Card title="可视化设计" class="feature-card">
          <p>通过拖拽组件快速设计界面</p>
        </Card>
      </Col>
      <Col :xs="24" :sm="12" :md="8">
        <Card title="智能生成" class="feature-card">
          <p>AI 自动生成业务逻辑代码</p>
        </Card>
      </Col>
      <Col :xs="24" :sm="12" :md="8">
        <Card title="一键部署" class="feature-card">
          <p>快速部署到云端，立即可用</p>
        </Card>
      </Col>
    </Row>
  </div>
</template>

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
