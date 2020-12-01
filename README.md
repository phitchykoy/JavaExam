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

### system_action : เอาข้อมูลสร้างตระกร้าสินค้า
- รหัสสินค้า
- จำนวนที่สั่งซื้อ
- ราคารวม


## หน้าสรุปรายการการสั่งซื้อ
### system_action : คำนวนส่วนลดและราคาสุทธิ

### system_action : แสดงรายการสินค้าในตระกร้าสินค้า
- รหัสสินค้า
- ชื่อสินค้า
- จำนวนที่สั่งซื้อ
- ราคารวม
- ส่วนลด 
- ราคาสุทธิ

### user_action
- กดปุ่มยืนยันการสั่งซื้อ

### system_action : บันทึกรายการการสั่งซื้อ
- Generate order_no
- ตัดจำนวนหนังสือคงเหลือจาก table : book
- บันทึกข้อมูลการสั่งซื้อใน table : order และ order_item

## หน้าแสดงเลขใบสั่งซื้อสินค้า
### system_action : แสดง Order_no
- แสดง Order_no

# Database
### Table : book
- book_id : integer (PK)
- name	: varchar2(200 byte)
- remain : interger	
- price : float

### Table : order
- order_id : integer (PK)
- price	: float
- discount : float	
- total_price : float

### Table : order_item
- item_id : integer (PK)
- book_id : integer (FK)
- amount : float	
- price : float
- order_id : integer (FK)
