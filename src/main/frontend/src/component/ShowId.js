import {Link} from "react-router-dom";
import React from "react";
import "../css/FindId.css"
import Layout from "./layout/Layout";

function ShowId(props){
    return(
        <Layout>
            <div style={{width: "100%", height: "100%"}}>
                {/*<Nav></Nav>*/}

                <h2 style={{borderBottom : '2px solid black',margin : '30px'}}>아이디 찾기</h2>
                <div className="find" style={{
                    display: 'flex', justifyContent: 'center', alignItems: 'center',
                    width: '100%', height: '100vh'
                }}>
                    <div className="findId" style={{height: "30%" ,display: 'flex', flexDirection: 'column',  padding: "10%"}}>
                        <h3>고객님의 정보와 일치하는 아이디입니다</h3>
                        <br/><br/>
                        <h3 style={{borderBottom: "2px solid black"}}>아이디 여기에</h3>
                    </div>
                </div>
            </div>
        </Layout>
    )
}
function Nav(){
    return(
        <div className="nav">
            <Link to="/">
                <h2 style={{color: "white"}}>DMZ</h2>
            </Link>
        </div>
    )
}
export {ShowId}