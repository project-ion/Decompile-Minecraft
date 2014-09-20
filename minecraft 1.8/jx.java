/*   1:    */ import java.util.Collection;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public class jx
/*   5:    */   implements id
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   private byte b;
/*   9:    */   private bqd[] c;
/*  10:    */   private int d;
/*  11:    */   private int e;
/*  12:    */   private int f;
/*  13:    */   private int g;
/*  14:    */   private byte[] h;
/*  15:    */   
/*  16:    */   public jx() {}
/*  17:    */   
/*  18:    */   public jx(int paramInt1, byte paramByte, Collection paramCollection, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  19:    */   {
/*  20: 29 */     this.a = paramInt1;
/*  21: 30 */     this.b = paramByte;
/*  22: 31 */     this.c = ((bqd[])paramCollection.toArray(new bqd[paramCollection.size()]));
/*  23: 32 */     this.d = paramInt2;
/*  24: 33 */     this.e = paramInt3;
/*  25: 34 */     this.f = paramInt4;
/*  26: 35 */     this.g = paramInt5;
/*  27:    */     
/*  28: 37 */     this.h = new byte[paramInt4 * paramInt5];
/*  29: 38 */     for (int i = 0; i < paramInt4; i++) {
/*  30: 39 */       for (int j = 0; j < paramInt5; j++) {
/*  31: 40 */         this.h[(i + j * paramInt4)] = paramArrayOfByte[(paramInt2 + i + (paramInt3 + j) * 128)];
/*  32:    */       }
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(hd paramhd)
/*  37:    */   {
/*  38: 47 */     this.a = paramhd.e();
/*  39: 48 */     this.b = paramhd.readByte();
/*  40: 49 */     this.c = new bqd[paramhd.e()];
/*  41: 50 */     for (int i = 0; i < this.c.length; i++)
/*  42:    */     {
/*  43: 51 */       int j = (short)paramhd.readByte();
/*  44: 52 */       this.c[i] = new bqd((byte)(j >> 4 & 0xF), paramhd.readByte(), paramhd.readByte(), (byte)(j & 0xF));
/*  45:    */     }
/*  46: 54 */     this.f = paramhd.readUnsignedByte();
/*  47: 55 */     if (this.f > 0)
/*  48:    */     {
/*  49: 56 */       this.g = paramhd.readUnsignedByte();
/*  50: 57 */       this.d = paramhd.readUnsignedByte();
/*  51: 58 */       this.e = paramhd.readUnsignedByte();
/*  52: 59 */       this.h = paramhd.a();
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void b(hd paramhd)
/*  57:    */   {
/*  58: 65 */     paramhd.b(this.a);
/*  59: 66 */     paramhd.writeByte(this.b);
/*  60: 67 */     paramhd.b(this.c.length);
/*  61: 68 */     for (bqd localbqd : this.c)
/*  62:    */     {
/*  63: 69 */       paramhd.writeByte((localbqd.a() & 0xF) << 4 | localbqd.d() & 0xF);
/*  64: 70 */       paramhd.writeByte(localbqd.b());
/*  65: 71 */       paramhd.writeByte(localbqd.c());
/*  66:    */     }
/*  67: 73 */     paramhd.writeByte(this.f);
/*  68: 74 */     if (this.f > 0)
/*  69:    */     {
/*  70: 75 */       paramhd.writeByte(this.g);
/*  71: 76 */       paramhd.writeByte(this.d);
/*  72: 77 */       paramhd.writeByte(this.e);
/*  73: 78 */       paramhd.a(this.h);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(ik paramik)
/*  78:    */   {
/*  79: 84 */     paramik.a(this);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int a()
/*  83:    */   {
/*  84: 88 */     return this.a;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void a(bqe parambqe)
/*  88:    */   {
/*  89: 92 */     parambqe.e = this.b;
/*  90: 93 */     parambqe.h.clear();
/*  91: 94 */     for (int i = 0; i < this.c.length; i++)
/*  92:    */     {
/*  93: 95 */       bqd localbqd = this.c[i];
/*  94: 96 */       parambqe.h.put("icon-" + i, localbqd);
/*  95:    */     }
/*  96: 98 */     for (i = 0; i < this.f; i++) {
/*  97: 99 */       for (int j = 0; j < this.g; j++) {
/*  98:100 */         parambqe.f[(this.d + i + (this.e + j) * 128)] = this.h[(i + j * this.f)];
/*  99:    */       }
/* 100:    */     }
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jx
 * JD-Core Version:    0.7.0.1
 */