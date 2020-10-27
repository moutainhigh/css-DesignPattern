package com.css.other.filter152;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		String msg = "大家好，<script>这些是敏感词1、敏感词2、<敏感词3>、王伟东</script>";

		Filter f = new Filter();

		Filter f1 = new HTMLFilter();
		Filter f2 = new SensitiveFilter();
		f1.setNext(f2);

		f.setNext(f1);
		msg = f.doNext(msg);

		System.out.println(msg);
	}

}