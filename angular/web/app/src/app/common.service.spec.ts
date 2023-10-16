import { TestBed } from '@angular/core/testing';

import { CommonService } from './common.service';

describe('CommonService', () => {
  let service: CommonService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CommonService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
  it('check the product list', () => {
    expect(service.getProductList().length).toEqual(8);
  });
  it('check the product details', () => {
    let product = service.getProductList()[0];
    expect(product.name).toEqual("Ring");
    expect(product.price).toEqual("400");
    expect(product.image).toEqual("p1.png");
  });
});
