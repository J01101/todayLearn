var app = new Vue({
    el: '#app',

    data: {
        header: 'Workshop_Vue.',
        messages: ['사용한 부분',
                'v-text, v-html, v-show, v-if, v-else, v-else-if, v-for, v-on, v-bind, v-model'
            ],
        title: '학생 정보 관리',
        message1: '이름을 입력해주세요',
        value1: '이름',
        message2: '전공을 입력해주세요.',
        value2: 0,
        majorList: ['컴퓨터 공학과','수학과','경제학과','법학과','음악과'],
        com: '전공 : 컴퓨터 공학 전공',
        math: '전공 : 수학 전공',
        econ: '전공 : 경제학 전공',
        law: '전공 : 범학 전공',
        music: '전공 : 음악 전공',
        message3: '학점을 입력해주세요.',
        grade : 3.0,
        label1 : '+0.5점',
        label2 : '-0.5점'
    },
    methods: {
        onClickUp: function(e){
            this.grade += 0.5
        },
        onClickDown: function(e){
            this.grade -= 0.5
        }
    }
});
