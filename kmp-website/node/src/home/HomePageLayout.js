import React from 'react';
import {Avatar, Breadcrumb, Button, Layout, Nav, Skeleton} from '@douyinfe/semi-ui';
import {
    IconBell,
    IconHeartStroked,
    IconHelpCircle,
    IconHistogram,
    IconHome,
    IconLikeHeart,
    IconLive,
    IconSetting
} from '@douyinfe/semi-icons';
import '../css/custom.css'

class HomePageLayout extends React.Component {

    render() {
        const {Header, Footer, Sider, Content} = Layout;
        return (
            <Layout style={{border: '1px solid var(--semi-color-border)'}}>
                <Header style={{backgroundColor: 'var(--semi-color-bg-1)'}}>
                    <div>
                        <Nav mode="horizontal" defaultSelectedKeys={['Home']}>
                            <Nav.Header>
                                <div style={{color: '#E91E63'}}>
                                    <IconLikeHeart style={{width: '96px', height: '36px', fontSize: 36}}/>
                                </div>
                            </Nav.Header>
                            <span
                                style={{
                                    color: 'var(--semi-color-text-2)',
                                }}
                            >
                            <span
                                style={{
                                    marginRight: '24px',
                                    color: 'var(--semi-color-text-0)',
                                    fontWeight: '900',
                                    fontSize: '26px'
                                }}
                            >
                                Kimm · Platform
                            </span>
                        </span>
                            <Nav.Footer>
                                <Button
                                    theme="borderless"
                                    icon={<IconBell size="large"/>}
                                    style={{
                                        color: 'var(--semi-color-text-2)',
                                        marginRight: '12px',
                                    }}
                                />
                                <Button
                                    theme="borderless"
                                    icon={<IconHelpCircle size="large"/>}
                                    style={{
                                        color: 'var(--semi-color-text-2)',
                                        marginRight: '12px',
                                    }}
                                />
                                <Avatar color="orange" size="small">
                                    LYS
                                </Avatar>
                            </Nav.Footer>
                        </Nav>
                    </div>
                </Header>
                <Layout>
                    <Sider style={{backgroundColor: 'var(--semi-color-bg-1)'}}>
                        <Nav
                            style={{maxWidth: 220, height: '100%'}}
                            defaultSelectedKeys={['Home']}
                            items={[
                                {itemKey: 'Home', text: '首页', icon: <IconHome size="large"/>},
                                {itemKey: 'Histogram', text: '基础数据', icon: <IconHistogram size="large"/>},
                                {itemKey: 'Live', text: '测试功能', icon: <IconLive size="large"/>},
                                {itemKey: 'Setting', text: '设置', icon: <IconSetting size="large"/>},
                            ]}
                            footer={{
                                collapseButton: true,
                            }}
                        />
                    </Sider>
                    <Content
                        style={{
                            padding: '24px',
                            backgroundColor: 'var(--semi-color-bg-0)',
                        }}
                    >
                        <Breadcrumb
                            style={{
                                marginBottom: '24px',
                            }}
                            routes={['首页', '当这个页面标题很长时需要省略', '上一页', '详情页']}
                        />
                        <div
                            style={{
                                borderRadius: '10px',
                                border: '1px solid var(--semi-color-border)',
                                height: 'auto',
                                padding: '32px',
                            }}
                        >
                            <Skeleton placeholder={<Skeleton.Paragraph rows={2}/>} loading={true}>
                                <p>Hi, Bytedance dance dance.</p>
                                <p>Hi, Bytedance dance dance.</p>
                            </Skeleton>
                        </div>
                    </Content>
                </Layout>
                <Footer
                    style={{
                        display: 'flex',
                        justifyContent: 'space-between',
                        padding: '20px',
                        color: 'var(--semi-color-text-2)',
                        backgroundColor: 'rgba(var(--semi-grey-0), 1)',
                    }}
                >
                <span
                    style={{
                        display: 'flex',
                        alignItems: 'center',
                    }}
                >
                    <IconHeartStroked size="large" style={{marginRight: '8px'}}/>
                    <span>Copyright © 2022-2022 Unithinf. All Rights Reserved. </span>
                </span>
                    <span>Kimm · Louis</span>
                </Footer>
            </Layout>
        );
    };
}

export default HomePageLayout;