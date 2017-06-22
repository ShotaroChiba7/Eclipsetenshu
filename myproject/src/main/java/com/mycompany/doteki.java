package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.NumberTextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class doteki extends WebPage {
	private static final long serialVersionUID = 3598788934381254916L;

	private Form form = new Form("f") {
		private static final long serialVersionUID = -1700095884500348972L;

		@Override
		protected void onSubmit() {
			System.out.println("送信ボタンが押されました");
			ResultPage result = new ResultPage((HomePage) this.getParent());
			setResponsePage(result);
		}
	};

	private Model mSubject = new Model();

	public doteki(final PageParameters parameters) {

		NumberTextField Subject = new NumberTextField("subject", mSubject);
		Subject.setRequired(true);
		form.add(Subject);

		add(form);
		Button a = new Button("") {
			public void onSubmit() {
				// イベントの処理
				// NOTICE 共通仕様（ログ出力）
				System.out.println("aaaa");
			}
		};
		form.add(a);
	}

	public Model getMSubject() {
		return mSubject;

	}

}