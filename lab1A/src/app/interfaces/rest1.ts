
import {IGPU} from "./gpu"

export interface Rest1 {

    _embedded: {
    
    gPUs: IGPU []
    },
    
    _links: {
    
    self: {
    href: string;
    },
    
    profile: {
    href: string;
    }
    },
    
    page: {
    size: number,
    totalElements: number,
    totalPages: number,
    number: number
    }
    }