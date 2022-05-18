import { TestBed } from '@angular/core/testing';

import { PackagedetailsService } from './packagedetails.service';

describe('PackagedetailsService', () => {
  let service: PackagedetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PackagedetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
