// export interface IGPU {
//     id: number;
// 	name: String;
// 	price :number;
//     width :number;
// }

export interface IGPU{
    name: string;
    price: number;
    width: number;
    
    _links: {
    
    self: {
    href: string;
    },
    
    gPU: {
    href: string;
    }
    }
}
