<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

body, html{
   height:100%;
   
}

#wrapper {   
   width:100%;
   height:100%;
   display:flex;
   flex-direction:column;
   /*position:fixed;
   top:0px;
   right:0px;
   bottom:0px;
   left:0px;*/
}

#header {
   border-bottom: 1px solid black;
   margin-bottom: 10px;
}

#content {
   flex-glow:1;
   height:80%;
   display: flex;
   min-height:0;
}

#sideBar {
   width: 300px;
   background-color: lightgray;
   padding-right: 10px;
   border-right: 1px solid black;
   overflow-y: scroll;
}

#center {
   flex-grow: 1;
   padding: 10px;
}

#center iframe {
   margin-top: 0px;
   width: 100%;
   height: 100%;
}

#footer {
   border-top: 1px solid black;
   margin-top: 10px;
   margin-bottom:10px;
}
</style>
</head>
<body>
   <div id="wrapper">
      <div id="header">
         <h3>ServletJspProgramming</h3>
      </div>
      <div id="content">
         <div id="sideBar">
            <ul>
               <li><a href="dispatcher1" target="iframe">서블릿 작성과 URL 매핑</a></li>
               <li><a href="dispatcher2" target="iframe">서블릿 초기화</a></li>
               <li><a href="dispatcher3?name=ansoyeong&age=23&tel=0101231234" target="iframe">GET 방식으로 요청</a></li>
               <li>
                  <form action="dispatcher3" method="get" target="iframe">GET 방식
                     <input type="text" name="name" value="hongkildong"/>
                     <input type="number" name="age" value="25"/>
                     <input type="tel" name="tel" value="0101231234"/>
                    
                     <input type="submit" value="get 방식으로 요청"/>
                  </form>
                  
                  <form action="dispatcher3" method="post" target="iframe">POST 방식
                     <input type="text" name="name" value="hongkildong"/>
                     <input type="number" name="age" value="25"/>
                     <input type="tel" name="tel" value="0101231234"/>
                    
                     <input type="submit" value="POST 방식으로 요청"/>
                  </form>
               </li>
               <li><a href="dispatcher4" target="iframe">응답 보내기</a></li>
               <li><a href="dispatcher5?name=hongkildon&age=25" target="iframe">요청 파라미터 받기</a></li>
               <li>
               <p>요청 파라미터 전달</p>
                  <form action="dispatcher5" method="get" target="iframe">GET 방식
                  <!-- 어떻게 정보를 넘길 것인지를 결정하는 것이 method (기본이 get방식) -->
                  <!-- get방식은 시작행에 넘길 수 있음(아스키코드만 가능) 
                  Post방식은 body에 담겨서 넘어 감(특정 정해진 형태가 없음 즉, 어떤 형태의 데이터를 보내도 상관없어
                  (단! 받는쪽에서 어떤 데이터인지 알게하기 위해 content type이용해서 알려줘야해-->
                     <input type="text" name="name" value="hongkildong"/>
                     <input type="number" name="age" value="25"/>
                    
                     <input type="submit" value="get 방식으로 요청"/>
                  </form>
                  
                  <form action="dispatcher5" method="post" target="iframe">POST 방식
                     <input type="text" name="name" value="hongkildong"/>
                     <input type="number" name="age" value="25"/>
                    
                     <input type="submit" value="POST 방식으로 요청"/>
                  </form>
              </li>
              
                <li>
                  <form action="dispatcher6" method="get" target="iframe">GET 방식
                     <input type="text" name="title" value="hongkildong"/>
                     <input type="text" name="content" value="25"/>
                    
                     <input type="submit" value="get 방식으로 요청"/>
                  </form>
                  
                  <form action="dispatcher6" method="post" target="iframe">POST 방식
                     <input type="text" name="title" />
                     <input type="text" name="content"/>
                    
                     <input type="submit" value="POST 방식으로 요청"/>
                  </form>
              </li>
              <li>
              	<p>객체 사용 범위</p>
              	<a href="dispatcher7" target="iframe">객체 저장하기</a><br/>
              	<a href="dispatcher8" target="iframe">객체 가져오기</a><br/>
              </li>
              
            </ul>
         </div>
         <div id="center">
            <iframe name="iframe" src="http://tomcat.apache.org" frameborder="0"></iframe>
         </div>
      </div>
      <div id="footer">2019.IoT.YKW</div>
   </div>
</body>
</html>