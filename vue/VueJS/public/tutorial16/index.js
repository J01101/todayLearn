const Home = {
    template: `<div>
            <h1>Home</h1>
            <div>Home페이지입니다.</div>
        </div>`
}

const About = {
    template: `<div>
            <h1>About</h1>
            <div>About페이지입니다.</div>
        </div>`
}

const routes = [
    {path: '/home', component: Home},
    {path: '/about', component: About}
]

const router = new VueRouter({
    routes: routes
})

const app = new Vue({
    el: '#app-16',
    router: router,
    data: {
        header: '튜토리얼16 - Router',
        messages: ['Vue는 SPA(Single Page Application)를 구축하는 것이 가능합니다.',
                '어플리케이션을 작성하면서 페이지 이동은 필요합니다.',
                '어플리케이션 내의 페이지 이동을 라우팅이라고 합니다.',
                '페이지 이동을 만들기 위해서는 Vue Router를 사용합니다.',
                '기본적으로 html에서는 <a>태그를 사용하고, 페이지 전체의 DOM을 갱신합니다.',
                'Vue Router에서는 router-link를 사용하고, 페이지 일부분의 DOM만을 갱신합니다.'
            ]
    }
});
