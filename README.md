# JavaExam

# Screen
## หน้ารายการสินค้า
### system_action : ดึงรายการสินค้าขึ้นมาแสดง
- รหัสสินค้า
- ชื่อสินค้า
- ราคาสินค้า
### user_action
- เลือกสินค้า
- ใส่จำนวนสินค้าที่ต้องการซื้อ
- กดปุ่มสั่งซื้อ

### system_action : บันทึกข้อมูลในตระกร้าสินค้า คำนวนส่วนลด และราคาสุทธิ
- Generate order_id
- บันทึกข้อมูลลง Table : order และ order_item
 (รหัสสินค้า,จำนวนที่สั่งซื้อ,ราคารวม,ส่วนลด,ราคารวมสุทธิ)
- ระบบแสดงหน้าสรุปรายการสั่งซื้อ

## หน้าสรุปรายการการสั่งซื้อ
### system_action : ดึงข้อมูลรายการสั่งซื้อในตระกร้า
- รหัสสินค้า
- ชื่อสินค้า
- จำนวนที่สั่งซื้อ
- ราคารวม
- ส่วนลด 
- ราคาสุทธิ

### user_action
- กดปุ่มยืนยันการสั่งซื้อ

### system_action : บันทึกรายการการสั่งซื้อ
- Generate order_code และ update order_code ใน table : order
- ตัดจำนวนหนังสือคงเหลือจาก table : book
- ระบบแสดงหน้าเลขใบสั่งซื้อสินค้า

## หน้าแสดงเลขใบสั่งซื้อสินค้า
### system_action : แสดง Order_no
- แสดง Order_no

# Database
### Table : book
- book_id : integer (PK)
- name	: varchar2(200 byte)
- remain : interger	
- price : integer

### Table : order
- order_id : integer (PK)
- order_code : integer
- price	: integer
- discount : integer	
- total_price : integer

### Table : order_item
- item_id : integer (PK)
- book_id : integer (FK)
- amount : integer	
- price : integer
- order_id : integer (FK)
