package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;

public class ResultPage extends WebPage {
	private static final long serialVersionUID = -8680953158566804713L;
	private WebPage formerPage;

	private Form form = new Form("f") {

		private static final long serialVersionUID = 5522440160951241211L;

		@Override
		protected void onSubmit() {
			System.out.println("実行ボタンが押されました");
			setResponsePage(formerPage);
		}

	};

	private Form form2 = new Form("ff") {

		private static final long serialVersionUID = 5522440160951241211L;

		@Override
		protected void onSubmit() {
			System.out.println("キャンセルボタンが押されました");
			setResponsePage(formerPage);
		}

	};

	public ResultPage(HomePage page) {
		this.formerPage = page;
		add(new Label("subject", page.getMSubject()));
		add(new Label("subject2", page.getMSubject2()));
		add(new Label("type", page.getMType()));
		add(new Label("date", page.getMDate()));
		add(new TextArea("article", page.getMArticle()));
		add(new TextArea("article2", page.getMArticle2()));
		add(form);
		add(form2);
	}

}