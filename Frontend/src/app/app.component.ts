import { Component, inject } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AccountService } from './services/account.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'devops_frontend';
  accountService = inject(AccountService);
  onSubmit(form: NgForm) {
    if (form.valid) {
      console.log(form.value)
      this.accountService.createAccount(form.value)
        .subscribe({
          next: res => {
            console.log(res);
            form.reset();
          },
          error: err => {
            console.log(err);

            const error = err.error;
          }
        });

    }
  }
}
