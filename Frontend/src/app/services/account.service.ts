import { Injectable,inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AccountService {
  http = inject(HttpClient);

  constructor() { }
  createAccount(account: any) {
    return this.http.post("http://54.196.180.175:1200/docker" + "/register", account);
  }
}
