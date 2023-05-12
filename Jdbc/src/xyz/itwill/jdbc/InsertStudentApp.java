package xyz.itwill.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

//JDBC(JAVA DATABASE CONNECTIVITY) : JAVA를 사용하여 DBMS 서버에 접속해 SQL 명령을 전달하여
//실행하기 위해 기능을 제공하는 JAVA API(클래스 또는 인터페이스)

//JAVA.SQL: JDBC 기능의 프로그램을 작성하기 위한 클래스 및 인터페이스가 선언된 패키지
//=> Java.sql 패키지에서는 JDBC 기능 구현을 위해 인터페이스 제거-DBMS 종류가 다양하므로 클래스로 제공 불가능
//=>DBMS 프로그램을 관리하는 그룹에서 JDBC기능을 구현하기 위한 클래스(JDBC Driver)를 배포하여 제공
//=>JDBC Driver가 포함된 라이브러리 파일(Jar 파일)를 다운로드 받아 프로젝트 빌드 처리해야만 JDBC 프로그램 작성 가능

//STUDENT 테이블 생성: 학번(숫자형-PRIMARY KEY), 이름, 전화번호, 주소, 생년월일
//STUDENT 테이블에 학생정보를 삽입하는 JDBC 프로그램 작성
public class InsertStudentApp {
	public static void main(String[] args){
		//1. OracleDriver 클래스로 객체를 생성하여 DriverManager 클래스에 JDBC Drive 객체로 등록
		//JDBC Driver 객체 : DriverManager
		//DriverManager 클래스 : 
		DriverManager.registerDriver(new OracleDriver());
	}
}
